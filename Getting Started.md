# Getting Started with Clojure

## Install Software

### Install java 8

On Linux you can use your package manage, e.g.:

    sudo apt-get install openjdk-8-jdk

On Mac OS X or Windows download from [oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### Install build tooling

For clojure there are two main build tools:

- [Leiningen](https://github.com/technomancy/leiningen)
- [Boot](https://github.com/boot-clj/boot)

Boot is the preferred tool because of its simplicity and power. This is enough when editing files in Emacs. When you want to use Cursive you will need Leiningen as well

#### Install boot

See https://github.com/boot-clj/boot for detailed instructions

To install Boot (OS X, Linux)

    sudo bash -c "cd /usr/local/bin && curl -fsSLo boot https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh && chmod 755 boot"

To install on Windows download [boot.exe](https://github.com/boot-clj/boot-bin/releases/download/latest/boot.exe) and then

    move boot.exe %SystemRoot%

Next run boot to bootstrap the system

    boot

This will create a `~/.boot/boot.properties` file. Change clojure version and boot version e.g.:

    BOOT_EMIT_TARGET=no
    BOOT_CLOJURE_NAME=org.clojure/clojure
    BOOT_VERSION=2.6.0
    BOOT_CLOJURE_VERSION=1.9.0-alpha6

Then run again to pull in the new versions of clojure and bootstrap

    boot

#### Install Leinigen

See https://github.com/technomancy/leiningen for instructions

## Editor

There are several good editor options:

- Emacs
- Cursive IDE (from JetBrains)

I prefer Emacs. Using Emacs presents a learning curve. It is unlike any other editor you have used. It gives you ultimate power.

### Install Emacs


See [here](http://david.rothlis.net/emacs/install.html). Make sure you have Emacs 24.1+

You will need to customize your Emacs to  `~/.emacs.d/init.el`

Cooler font

    (set-frame-font "Monaco-12" nil t)

Line numbers

    (global-linum-mode t)
    (setq)
Add the following to your `~/.emacs.d/init.el` file:
