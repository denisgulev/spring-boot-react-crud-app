# spring-boot-react-crud-app

1. project creation + basic controller and test class for it
2. created yaml file for properties
3. installed lombok (through official site) -> add lombok dependency in 'pom.xml' -> use of @Log4j2 annotation + log4j2.xml file definition (log to console and to file)
4. integrated h2 (in-memory db + data.sql and schema.sql), started JPAconfiguration, introduced Entity and JPARepository
5. added controller for CRUD operations (GET, POST, PATCH, DELETE)
6. integrated authentication (password = '**passwordprova**') and jwt authorization (**WIP**)