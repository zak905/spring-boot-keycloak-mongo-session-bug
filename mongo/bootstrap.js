conn = new Mongo();
db = conn.getDB("tester");
db.createUser({ user: "tester", pwd: "tester", roles: [ {role: "dbOwner", db: "tester"} ]});