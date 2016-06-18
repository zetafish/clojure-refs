# Getting Started with Clojure

## Java

In order to run Clojure you need java.

On Linux you can use your package manage, e.g.:

    sudo apt-get install openjdk-8-jdk

On Mac OS X or Windows download from [oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

## Build tooling

For clojure there are two main build tools:

- [Boot](https://github.com/boot-clj/boot)
- [Leiningen](https://github.com/technomancy/leiningen)

Boot is the preferred tool because of its simplicity and power. This is enough when editing files in Emacs. When you want to use Cursive you will need Leiningen as well

### Boot

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
    BOOT_CLOJURE_VERSION=1.8.0

Then run again to pull in the new versions of clojure and boot

    boot

### Leinigen

See https://github.com/technomancy/leiningen for instructions

## Editor

There are several good editor options:

- Emacs+CIDER
- Cursive IDE (from JetBrains)
- Vim+Fireplace

### Emacs

Emacs+CIDER is perfect for Clojure development. Emacs is unlike any other text editor. It is fully programmable and customizable. I find it more powerful than an IDE.

You want to install Emacs 24.1+, see http://david.rothlis.net/emacs/install.html

You will need to configure Emacs for proper clojure editing. The init file is in `~/.emacs.d/init.el` and is written in ELisp. Put the following in the init file:


    ;; A nicer font
    (set-frame-font "Monaco-12" nil t)

    ;; Line numbers
    (global-linum-mode t)
    (setq linum-format "%4d ")

    ;; Highlight parenthesis
    (show-paren-mode 1)

    ;; Package management
    (require 'package)
    (add-to-list 'package-archives '("melpa" . "https://melpa.org/packages/") t)
    (package-initialize)
    (unless package-archive-contents (package-refresh-contents))
    (when (not (package-installed-p 'paradox))
        (package-install 'paradox))

    ;; Install Clojure packages
    (paradox-require 'clojure-mode)
    (paradox-require 'clj-refactor)
    (paradox-require 'paredit)
    (paradox-require 'eldoc)
    (paradox-require 'cider)
    (paradox-require 'flycheck-clojure)

    (add-hook 'clojure-mode-hook
          (lambda ()
            (paredit-mode)
            (eldoc-mode)
            (clj-refactor-mode 1)))


### Vim+Fireplace

TODO

### Cursive

TODO

## Code style

See https://github.com/bbatsov/clojure-style-guide
