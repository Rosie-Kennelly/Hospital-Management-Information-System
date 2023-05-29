CREATE TABLE consent_form (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  date_signed DATE NOT NULL,
  consent_text TEXT NOT NULL
);