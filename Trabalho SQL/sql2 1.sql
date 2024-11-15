--- criar estoque
--- transações commitar e rollback
--- https://www.w3schools.com/sql/default.asp
--- joins estudar todos join
---
--- usuarios , permissoes



insert into tb_clientes (nome) values ('Maria');
insert into tb_clientes (nome) values ('João');

select * from tb_clientes;


select * from tb_produtos;

insert into tb_produtos (descricao,valor) values ('Uva', 2);
insert into tb_produtos (descricao,valor) values ('Banana', 1.5);
insert into tb_produtos (descricao,valor) values ('Laranja', 3.75);


select * from tb_pedidos;

insert into tb_pedidos (data,idcliente) values ('2024-10-01', 1);
insert into tb_pedidos (data,idcliente) values ('2024-09-01', 2);

select * from tb_pedidos p 
  inner join tb_clientes c on (p.idcliente = c.idcliente);
  
select distinct * from tb_pedidos p 
  inner join tb_clientes c on (p.idcliente = c.idcliente);

select * from tb_pedidositens;

--insert into tb_pedidositens (idpedido, idproduto, quantidade, valorunitario) values (1,1,2,2);  

select * from tb_pedidositens i 
  inner join tb_produtos p on (i.idproduto = p.idproduto);

select valor from tb_produtos p where (p.idproduto = 2);

delete from tb_pedidositens i where i.idpedido = 1;

insert into tb_pedidositens (idpedido, idproduto, quantidade, valorunitario) values (1,1,2,
(select p.valor from tb_produtos p where (p.idproduto = 2)));  

---
delete from tb_pedidositens i where i.idpedido = 2;

select * from tb_pedidositens;

insert into tb_pedidositens (idpedido, idproduto, quantidade, valorunitario) values (2,1,10,
(select p.valor from tb_produtos p where (p.idproduto = 1)));  

insert into tb_pedidositens (idpedido, idproduto, quantidade, valorunitario) values (2,2,20,
(select p.valor from tb_produtos p where (p.idproduto = 2)));  

insert into tb_pedidositens (idpedido, idproduto, quantidade, valorunitario) values (2,6,30,
(select p.valor from tb_produtos p where (p.idproduto = 6)));  

select * from tb_pedidositens i where i.idpedido = 1;
select * from tb_pedidositens i where i.idpedido = 2;

-----------------

select c.nome as nome_cliente , p.data,
  
  (select sum(i.quantidade * i.valorunitario) as valortotal
    from tb_pedidositens i
   where i.idpedido = p.idpedido) as valortotal,

  (select count(idproduto) as qtd_produto
    from tb_pedidositens i
   where i.idpedido = p.idpedido) as qtditens
   
  from tb_pedidos p 
 inner join tb_clientes c on (p.idcliente = c.idcliente);


select c.nome , p.data,
sum(i.quantidade * i.valorunitario) as valortotal,
count(i.idproduto) as qtd_produto
   from tb_pedidos p 
 inner join tb_clientes c on (p.idcliente = c.idcliente)
 inner join tb_pedidositens i on (p.idpedido = i.idpedido)
 inner join tb_produtos prd on (i.idproduto = prd.idproduto)
 group by c.nome , p.data
 ;
 

-----------------

  select sum(i.quantidade * i.valorunitario) as valortotal
    from tb_pedidositens i
   where i.idpedido = 2;

  
select distinct * 
  from tb_pedidos p 
 inner join tb_clientes c on (p.idcliente = c.idcliente)
 inner join tb_pedidositens i on (p.idpedido = i.idpedido)
 inner join tb_produtos prd on (i.idproduto = prd.idproduto);

  