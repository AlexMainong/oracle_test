import cx_Oracle
conn = cx_Oracle.connect('system/123456@localhost:1521/ORCL')
cur = conn.cursor
cur.execute('insert into test_table values (1, TYPE1('3', 'rec', 'rec2'))
cur.execute('select * from test_table')
for line in cur:
    print(line)
cur.close()
conn.close()
