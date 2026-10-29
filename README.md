# QA Lectures

Slides and examples for the QA lecture course.

* `slides/` -- lecture slide decks (AsciidoctorJ + reveal.js), one Maven module per lecture
* `examples/` -- code examples accompanying the lectures

## Build

```
cd slides && mvn verify      # slides -> slides??/target/generated-slides/index.html
cd examples && mvn verify    # examples
./slides/spellcheck-ru.sh    # requires aspell with the Russian dictionary
```
