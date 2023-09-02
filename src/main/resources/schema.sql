CREATE TABLE APPLICATIONTABLE(
    id INT PRIMARY KEY auto_increment,
    name VARCHAR,
    identityNumber VARCHAR,
    address VARCHAR,
    phoneNumber VARCHAR,
    email VARCHAR,
    birthDate VARCHAR,
    hasExperience BOOLEAN,
    choosingReason VARCHAR,
    selectedLocation VARCHAR,
    amount VARCHAR,
    additionalNotes VARCHAR
);