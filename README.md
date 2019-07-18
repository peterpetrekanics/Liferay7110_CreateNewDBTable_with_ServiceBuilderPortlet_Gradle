# Liferay7110_UpgradeDBTable_with_ServiceBuilderPortlet_Gradle


there are many important things to note:
- in case of a Service Builder app, when upgrading, we should:
	- update the src/main/resources/META-INF/portlet-model-hints.xml  with the db changes
	- it is NOT needed to create a FOOTable.java  class
	- the version of the service jar file's bnd.bnd should be 1.0.1 if it is a minor change
	- the easiest way of doing a micro change is this:
		String sql = "ALTER TABLE FOO_Foo modify COLUMN field5 VARCHAR(255)";
		runSQL(sql);
	- during my tests, the db table column was updated even if there was a data row in the table
	- I am not sure which step did run at the upgrade process: either the portlet-model-hints.xml was read or the doUpgrade() method ran the alter table command.
	Maybe the hints are only used if the db gets deleted and the portlet is deployed on a clean Liferay.
