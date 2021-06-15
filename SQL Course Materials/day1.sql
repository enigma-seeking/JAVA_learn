use sql_store;
select * #实际中很少用*，因为对数据库服务器和网络带来很大的负担
from customers
# where customer_id = 1
order by first_name;

select first_name AS 'test1', last_name AS 'test2'#实际中很少用*，因为对数据库服务器和网络带来很大的负担
from customers
# where customer_id = 1
order by first_name;

# 练习1
# return all the products
#     name
#     unite price
#     new price(unite price*1.1)
use sql_inventory;
select name, unit_price, unit_price*1.1 as 'new price' from products;

USE sql_store;
SELECT *
FROM customers
where state != 'VA';

SELECT *
FROM customers
where birth_date > '1990-01-01';
#这是sql默认的时间格式，用引号表述日期值，即使不是字符串

#练习2
# get the orders placed this year
select order_date
from orders
where order_date >= '2019-01-01';

# 练习3
# from the order_items table, get the items for order #6
# where the total price is greater than 30

SELECT * from order_items
where order_id = 6 and unit_price * quantity >30;