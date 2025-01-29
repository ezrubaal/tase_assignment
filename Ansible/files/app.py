from flask import Flask, send_file
import redis

app = Flask(__name__)
db = redis.Redis(host="redis", port=6379, decode_responses=True)

# Serve the static HTML page
@app.route("/")
def home():
    return send_file("index.html")  # Flask serves the HTML file

# API to get and update the visitor count
@app.route("/counter")
def counter():
    count = db.incr("hits")  # Increment visitor count in Redis
    return str(count)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
