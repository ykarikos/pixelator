# pixelator

Create pixelated svg image out of a text file, e.g. [a chilicorn](http://chilicorn.org).

[![Empowered by Futurice's open source sponsorship program](https://img.shields.io/badge/sponsor-chilicorn-ff69b4.svg)](http://futurice.com/blog/sponsoring-free-time-open-source-activities?utm_source=github&utm_medium=spice&utm_campaign=pixelator)

## Usage

You can either bake a jar:

    $ lein uberjar
    $ java -jar target/uberjar/pixelator-0.1.0-SNAPSHOT-standalone.jar input-file.txt >output-file.svg

... or run with leiningen:

    $ lein run input-file.txt >output-file.svg

## Input file

The input file is a plain text file with three blocks
1. `n`: First row is a number defining the number of colors used.
2. `colormap`: Second block consists of `n` rows each specifying one color with the format `[letter] [color-code]` where `letter`  is one character long color abbreviation and `color-code` is a RGB hex color value, e.g. `FFFFFF` for white. The values are separated by space. If you add a space after the `color-code`, you can add comments.
3. `pixels`: Third block are the pixels each specified by one character. Characters that are not in the in the colormap are skip.

### Example input file

```
2
r A02020 dark red
b 2020A0 dark blue
  r
 rbr
rbrbr
 rbr
  r
```

## License

Copyright © 2016 Yrjö Kari-Koskinen <ykk@peruna.fi>

Pixelator is licensed with the MIT License, see [LICENSE](https://github.com/ykarikos/pixelator/blob/master/LICENSE).
