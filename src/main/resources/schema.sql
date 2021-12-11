CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;
CREATE TABLE FLIGHT_RECORD (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  FLIGHT_NUMBER VARCHAR(8) NOT NULL,
  ORIGIN VARCHAR(4) NOT NULL,
  DESTINATION VARCHAR(4) DEFAULT NULL,
  STD TIMESTAMP(9),
  STA TIMESTAMP(9), 
  STATUS VARCHAR(50) NOT NULL
);
