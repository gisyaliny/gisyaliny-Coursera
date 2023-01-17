# Using the DBeaver Client to Run SQL Commands

## What is Dbeaver and how to install it

Dbeaver is a free cross-platform database tool for developer, which supports all popular database: MySQL, PostgreSQL, SQLite, Oracle, DB2, etc.

We can directly download it from the [official website](https://dbeaver.io/)

When you first time use it, it would ask you to download some helpful driver.

## Connect to your database

For example, if we want to connect the PostgreSQL server which host by pg.pg4e.com with given credentials, we could use the following psql command. But here, we want to use DBeaver as our client because it has more wonderful features.

![](RackMultipart20220305-4-15ch15j_html_f7feb31071a3018f.png)

F ![](RackMultipart20220305-4-15ch15j_html_cdfc62439a6e0b60.png) or doing that, select the connection button, and choose the PostgreSQL, in the prompt up box, fill up the required info to connect to the remote database server.

![](RackMultipart20220305-4-15ch15j_html_49c26e4fcc8ee323.png)

And then click the finish button, you were able to see the connected database info in the DBeaver platform

![](RackMultipart20220305-4-15ch15j_html_9674ddc97af213b8.png)

## Write the first SQL script in DBeaver

1. Select the database you want to deal with
2. Click the SQL button, and select the &quot;SQL Script&quot; option, or directly **use &quot;F3&quot; shortcut** to create a new script
3. Type your SQL with the script and click the run Button once finished.
4. After the script runs, you have to fresh the database **(&quot;F5&quot;)** to see the changes.

![](RackMultipart20220305-4-15ch15j_html_92d003538348a8b4.png)