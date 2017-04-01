# Archetypes
This repository provides several maven archetypes.

## Usage

- Install into local maven repository:
    ```bash
    mvn install
    ```
    or just some of them:
    ```bash
    mvn install -pl {archetypeName}[,...]
    ```
- Generate project:
    ```bash
    mvn archetype:generate                  \
    -DarchetypeCatalog=local                \
    -DarchetypeGroupId=pers.zlf.archetypes  \
    -DarchetypeArtifactId={archetypeName}   \
    -DarchetypeVersion=1.0.0
    ```
