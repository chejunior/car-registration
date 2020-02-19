DROP TABLE IF EXISTS brand;
 
CREATE TABLE brand (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  model VARCHAR(250) NOT NULL
);
 
INSERT INTO brand (name, model) VALUES
  ('Ford', 'Mustang'),
  ('Renault', 'Stepway'),
  ('Renault', 'Sandero');