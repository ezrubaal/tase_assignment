# Extract Script - README

## Overview
The `extract` script is a Bash utility that automatically detects and extracts compressed files based on their actual file type (determined using the `file` command). It supports multiple compression formats and can traverse directories recursively if needed.

## Supported File Types & Required Dependencies
To ensure successful extraction, you must install the necessary tools for each file type. The script does **not** install dependencies automatically, so make sure they are available on your system.

| File Type  | Required Tool | Installation Command |
|------------|--------------|----------------------|
| `.gz`      | `gunzip`     | Included in most Linux distributions |
| `.bz2`     | `bunzip2`    | Included in most Linux distributions |
| `.zip`     | `unzip`      | `sudo apt install unzip` (Ubuntu/Debian)  / `sudo yum install unzip` (CentOS/RHEL) |
| `.Z`       | `uncompress` | `sudo apt install ncompress` (Ubuntu/Debian) / `sudo yum install ncompress` (CentOS/RHEL) |
| `.tar`     | `tar`        | Included in most Linux distributions |
| `.7z`      | `7z`         | `sudo apt install p7zip-full` (Ubuntu/Debian) / `sudo yum install p7zip` (CentOS/RHEL) |
| `.rar`     | `unrar` or `7z` | `sudo apt install unrar` or `sudo apt install p7zip-full` |

For Windows (Git Bash or Cygwin), install the required tools using:
```sh
pacman -S unzip p7zip ncompress
```

## Usage
```
extract [-h] [-r] [-v] file [file...]
```

### Options
- `-h` → Show help message
- `-r` → Recursively extract archives inside directories
- `-v` → Verbose mode (shows decompression details and warnings)

### Examples
#### Extract a single file
```sh
./extract file.zip
```

#### Extract multiple files
```sh
./extract file1.zip file2.tar file3.gz
```

#### Extract all archives in a directory (recursively)
```sh
./extract -r /path/to/directory
```

#### Extract with verbose mode
```sh
./extract -v file.7z
```

## Notes
- The script **ignores file extensions** and detects the format using the `file` command.
- If an archive type is **not supported**, the script skips it and returns a warning (if `-v` is used).
- If a required tool is missing, install it using the commands listed above.

## License
This script is provided as-is, without warranty. Use it at your own risk.
