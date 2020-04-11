INSERT INTO Brand (brand_Id, brand_Name, brand_Description) VALUES
  (1, 'Luis Philipe','premium'),
  (2, 'Raymond','ultra-premium'),
  (3, 'Arrow','local');


INSERT INTO Product (id, price, color, size, brand_id, type) VALUES
  (1, 2000, 'Red',40,1,'Shirt'),
  (2, 3000, 'Yellow',34,2,'Pant'),
  (3, 3000, 'Grey',34,3,'Shirt'),
  (4, 3000, 'Grey',34,1,'Pant'),
  (5, 3000, 'Grey',34,2,'Shirt');