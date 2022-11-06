CREATE TABLE `demo_login_module3`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `demo_login_module3`.`account` (
  `id` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `birthday` DATE NULL,
  PRIMARY KEY (`id`),
  id_role int,
  foreign key (id_role) references roles(id)
  );
  
INSERT INTO `demo_login_module3`.`roles` (`id`, `name`) VALUES ('1', 'user');
INSERT INTO `demo_login_module3`.`roles` (`id`, `name`) VALUES ('2', 'admin');

INSERT INTO `demo_login_module3`.`account` (`id`, `username`, `password`, `address`, `birthday`, `id_role`) VALUES ('1', 'Toan', '123456', 'QN', '1998/08/12', '2');
INSERT INTO `demo_login_module3`.`account` (`id`, `username`, `password`, `address`, `birthday`, `id_role`) VALUES ('2', 'Viet', '111111', 'HN', '1993/08/03', '1');

select * from account where username = 'toan' and password = '123456';

CREATE TABLE `demo_login_module3`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `img` VARCHAR(255) NULL,
  `price` DOUBLE NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `demo_login_module3`.`order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_account` INT NULL,
  `date` DATE NULL,
  PRIMARY KEY (`id`),
foreign key (id_account) references account(id)
);

CREATE TABLE `demo_login_module3`.`detail_order` (
  `id_order` INT NOT NULL,
  `id_product` INT NOT NULL,
  `amount` INT NULL,
  PRIMARY KEY (`id_order`, `id_product`),
  foreign key (id_order) references `order`(id),
  foreign key (id_product) references product(id)
);



  
  