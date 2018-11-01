variable  i NUMBER;
BEGIN
:i:=1;
INSERT INTO test_table VALUES (
:i,
TYPE1('3', 'rec', 'rec2'));
END; 