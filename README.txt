
A GUI to configure a dictionary-matcher-transfomer.

Compile with

    mvn install


and start with

    cd target
    java -jar p3-dictionary-matcher-transformer-factory-gui-*-jar-with-dependencies.jar


Now you should be able to access the service at:

    http://localhost:8202/?transformerBase=http://sandbox.fusepool.info:8192/&transformerRegistry=http://sandbox.fusepool.info:8181/ldp/tr-ldpc#