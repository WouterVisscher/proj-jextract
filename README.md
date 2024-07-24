# proj-jextract

## jextract

```sh
wget https://download.java.net/java/early_access/jextract/22/5/openjdk-22-jextract+5-33_linux-x64_bin.tar.gz
tar -xvf openjdk-22-*
```

```sh
./jextract-22/bin/jextract \
  --include-dir /usr/include \
  --output src \
  --target-package org.jextract.proj \
  --library proj \
  /usr/include/proj.h
```
