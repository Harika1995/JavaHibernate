# JavaHibernate
### IDE Used: Eclipse
1. Install Eclipse IDE add the JBoss Tools 4.13.0.Final plugin to work with the Hibernate Environment.
  - To install the the JBoss Tools 4.13.0.Final plugin:
      - Click on"Help" Menu from the Eclipse Menu bar.
      - Go to Eclipse Market Place from the dropdown.
      - Search for the JBoss Tools 4.13.0.Final in the search bar.
      - Click on install and restart the Eclipse IDE to update the changes.
2. Create a oracle database table as "employee".
3. Crate a Project.
  - To create a Hibernate project:
    - Click on the "File" menu and click on "New" option for the the file menu options.
    - Click on "Other" and type as "Maven" select "Maven Project from the appered search and hit next.
    - Give the "Group Id" and "Artifact Id" and hit finish.
4. Add the maven dependencies.
  - **Maven dependency:**
    - <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>4.3.11.Final</version>
    </dependency>
  - **Oracle database dependency (for the system path):**
    - <dependency>
      <groupId>com.oracle</groupId>
      <artifactId>ojdbc</artifactId>
      <version>8</version>
      <scope>system</scope>
      <systemPath>C:\app\harika\product\12.2.0\dbhome_1\jdbc\lib\ojdbc8.jar</systemPath>
    </dependency>
