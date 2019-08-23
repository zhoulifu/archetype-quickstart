# Archetypes

This repository provides several maven archetypes.

## Installing archetypes

```sh
$> mvn install archetype:crawl
```

## Using archetypes

```sh
$> mvn archetype:generate                 \
  -DarchetypeCatalog=local                \
  -DarchetypeGroupId=pers.zlf.archetypes  \
  -DarchetypeArtifactId={archetypeName}   \
  -DarchetypeVersion=1.0.0
```
