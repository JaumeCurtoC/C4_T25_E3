DROP TABLE IF EXISTS almacenes;

create table almacenes(
	id int auto_increment,
    lugar varchar(100),
    capacidad int,
    primary key (id)
);

insert into almacenes (lugar, capacidad)
values ('Almacen1', 500);
insert into almacenes (lugar, capacidad)
values ('Almacen2', 1000);
insert into almacenes (lugar, capacidad)
values ('Almacen3', 2000);

drop table if exists cajas;

create table cajas(
	id int auto_increment,
    contenido varchar(100),
    valor int,
    almacen int,
    primary key (id),
    FOREIGN KEY (almacen) REFERENCES almacenes (id) 
	ON DELETE CASCADE ON UPDATE CASCADE
);

insert into cajas (contenido, valor, almacen)
values ('Caja1', 50, 1);
insert into cajas (contenido, valor, almacen)
values ('Caja2', 75, 2);
insert into cajas (contenido, valor, almacen)
values ('Caja3', 100, 3);