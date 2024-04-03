# OGC API Features JSON Java

#### OGC API Features JSON Lib ####

The OGC API Libraries were developed at the [National Geospatial-Intelligence Agency (NGA)](http://www.nga.mil/) in collaboration with [BIT Systems](https://www.caci.com/bit-systems/). The government has "unlimited rights" and is releasing this software to increase the impact of government investments by providing developers with the opportunity to take things in new directions. The software use, modification, and distribution rights are stipulated within the [MIT license](http://choosealicense.com/licenses/mit/).

### Pull Requests ###
If you'd like to contribute to this project, please make a pull request. We'll review the pull request and discuss the changes. All pull request contributions to this project will be released under the MIT license.

Software source code previously released under an open source license and then modified by NGA staff is considered a "joint work" (see 17 USC § 101); it is partially copyrighted, partially public domain, and as a whole is protected by the copyrights of the non-government authors and must be released according to the terms of the original open source license.

### About ###

[OGC API Features JSON](http://ngageoint.github.io/ogc-api-features-json-java/) is a Java library for writing and reading [OGC API - Features](https://github.com/opengeospatial/WFS_FES) to and from JSON.

### Usage ###

View the latest [Javadoc](http://ngageoint.github.io/ogc-api-features-json-java/docs/api/)

#### Read ####

```java

Collections collections = FeaturesConverter.toCollections(collectionsContent);
Collection collection = FeaturesConverter.toCollection(collectionContent);
FeatureCollection featureCollection = FeaturesConverter.toFeatureCollection(featureCollectionContent);

```

#### Write ####

```java

String collectionsContent = FeaturesConverter.toStringValue(collections);
String collectionContent = FeaturesConverter.toStringValue(collection);
String featureCollectionContent = FeaturesConverter.toStringValue(featureCollection);

```

### Installation ###

Pull from the [Maven Central Repository](http://search.maven.org/#artifactdetails|mil.nga.oapi.features|oapi-features-json|3.0.0|jar) (JAR, POM, Source, Javadoc)

```xml

<dependency>
    <groupId>mil.nga.oapi.features</groupId>
    <artifactId>oapi-features-json</artifactId>
    <version>3.0.0</version>
</dependency>

```

### Build ###

[![Build & Test](https://github.com/ngageoint/ogc-api-features-json-java/workflows/Build%20&%20Test/badge.svg)](https://github.com/ngageoint/ogc-api-features-json-java/actions/workflows/build-test.yml)

Build this repository using Eclipse and/or Maven:

    mvn clean install

### Remote Dependencies ###

* [Simple Features GeoJSON](https://github.com/ngageoint/simple-features-geojson-java) (The MIT License (MIT)) - Simple Features GeoJSON Lib
