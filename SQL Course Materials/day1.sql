use sql_store;
select * #实际中很少用*，因为对数据库服务器和网络带来很大的负担
from customers
# where customer_id = 1
order by first_name;

select first_name, last_name #实际中很少用*，因为对数据库服务器和网络带来很大的负担
from customers
# where customer_id = 1
order by first_name;
