# RPGlang - Abstract Syntax

Abstract syntax (meta-model) for a DSL created for the purpose of designing talent trees and ability systems for role-playing video games. This project contains concepts that are used in the development of these systems, their relationships and descriptions using meta-data, which is used for further development following the model-driven paradigm.

This repo is part of a larger project, which contains the following:

* abstract syntax - this repo
* graphical concrete syntax - `https://github.com/bbatalo/rpg.design`
* code generator - `https://github.com/bbatalo/rpg.generator`
* example game engine - `https://github.com/bbatalo/rpg.engine`

Together, these provide the user with the ability to design talent trees and ability systems using the graphical syntax (diagrams), generate code that is runnable in the example game engine and test the validity of the build by playing the game!

## Motivation

The creation of talent trees and ability systems in role-playing video games can be a troublesome effort, especially considering that these systems have to be play-tested to check for balance issues and other validity concerns. The motivation behind this project is the desire to provide game designers with tools to create and play around with different systems and builds, without burdening the development team.

This is aimed to be acomplished using the model-driven paradigm, by developing a domain-specific language, with graphical syntax, which can be used by game designers. These designers would then be able to generate working code for specific game engines and play-test their builds.

Since this project is a proof-of-concept, code generation will be supported only for above-mentioned example game engine. The implementation of other code generators is possible and likely.

## Getting Started

To start working on this project, it is enough to clone the repo and setup the required Eclipse IDE with specified plugins.

### Prerequisites

Since the project is implemented using the EMF (Eclipse Modeling Framework), it is required to have Eclipse IDE and specified plugins.

* Eclipse IDE
* Eclipse Modeling Tools
* Eclipse Ecore Tools

For FTN students: provided Eclipse IDE installation (for DSL course) contains everything you need.

### Project structure

All development work should be done on .ecore and .ecorediag files (which are synced), and for testing, it is possible to create .xmi files.

The project consists of following main files and directories:

* src (dir) - Java source files generated from the metamodel (using the genmodel)
* rpg.ecore - metamodel in ecore notation
* rpg.ecorediag - metamodel in diagram notation
* rpg.genmodel - file used in model and editor code generation
* *.xmi - example dynamic model files that (should) conform to the ecore metamodel

The rest of the files are eclipse project-related files.

### Genmodel

The genmodel is a file created from the .ecore metamodel, that is used for generating Java source code for the metamodel, editor etc. To generate these source code, do the following:

* Open the genmodel
* Right-click on the root element
* Select the type of code to generate

Model, edit and editor codes must be generated (this is essentially an Eclipse plug-in) for use in concrete syntax and code generator projects.

## Todo

This section outlines features that will be implemented, as well as bug fixes and adjustments that need to be made.

Demo:

* Create dummy RPG for showcasing everything in the meta-model

Maintenance:

* Check the current implementation for possible improvements
* Check constraints
* Check attributes and their default values

Features:

* Add talent trees
* Add modifiers for ticks
* Setup activation conditions for each node activation level
* Add locked nodes (and the ability to unlock them)
* Optionally merge branches upon inheritance

Improvements:

* Add randomizers to effect modifiers
* Factor in node levels for effect modifiers
* ~~Remove 'startingNodes' relationship between Branch and Node~~
* ~~Constraint: A branch must have at least one ROOT Node~~
* ~~Remove isActivated flag -> redundant, activationLevel is present and carries same semantics~~
* ActivationCost must consume statistic of host Class or parent Class
* ~~Parent Node must be activated in order to activate Child Node~~

Possible:

* Define ability targets as classes?
* Allow multiple parent nodes in trees?
* Change containment relationship to reference for (node -> ability/talent)?

## Licence

## Meta

This project is part of my MSc thesis on the topic of domain-specific languages and MD*,
at Chair for Applied Computer Science, Faculty of Technical Sciences, University of Novi Sad.

## Acknowledgments
