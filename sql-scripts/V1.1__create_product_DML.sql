USE optilakeadmin;

ALTER TABLE `test` DISABLE KEYS;
REPLACE INTO `test` (`id`, `payload`) VALUES
	(1, '{"glossary": {"title": "example glossary", "GlossDiv": {"title": "S", "GlossList": {"GlossEntry": {"ID": "SGML", "Abbrev": "ISO 8879:1986", "SortAs": "SGML", "Acronym": "SGML", "GlossDef": {"para": "A meta-markup language, used to create markup languages such as DocBook.", "GlossSeeAlso": ["GML", "XML"]}, "GlossSee": "markup", "GlossTerm": "Standard Generalized Markup Language"}}}}}'),
	(2, '{"age": 30, "car": null, "name": "John"}');
ALTER TABLE `test` ENABLE KEYS;