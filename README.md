# Spring WebClient using Kotlin

This is a follow up to my [Spring WebClient in Java learning application](https://github.com/lwiddershoven/webclientdemo).
This is what I used to explore the replacement of RestTemplate, WebClient, in particular the way reactive works and
the error handling and logging hooks available. 

I also explored how to best match the reactive flowlike pipeline syntax with the Spring dependency injection based 
component concept that has proven to be so successful in managing complexity. 

My goal was, and is, not to create a fully reactive application but only use reactive for IO flows. 

In this demo I try to use WebClient in a Kotlin application in a way that complements Kotlin. Something that 
integrates nicely with thee awesome coroutine concept.

As you may notice I favor coroutines a lot more that reactive, because it is far more easy to reason about. The
reactive operators can have quite nuanced side effects which makes it hard to read and extend by non-expert 
developers. Coroutines are just more straightforward, at least for me.

## Links

For this experiment I used:
- start.spring.io to create the project
- spring-fox to dynamically create a swagger UI (/swagger-ui)
- httpie (not wget or curl) for simple tests from the command line
- The following article: https://spring.io/blog/2019/04/12/going-reactive-with-spring-coroutines-and-kotlin-flow