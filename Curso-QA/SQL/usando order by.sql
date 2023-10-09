SELECT FirstName, LastName
FROM Person.Person
ORDER By firstName asc, Lastname desc
--ordena qual coluna vem primeiro.
SELECT TOP 10 productid,name
FROM Production.Product
ORDER By ListPrice asc
--seleciona os 10 primeiros de acordo com o mais caro
SELECT TOP 4 name, productnumber
FROM Production.Product
order by ProductID asc
-- seleciona os 4 produtos em ordem crescente puxando do id do produto, mas tbm se pode ser pelo nome, etc.
