Axis1 Client
there are 2 types of clients, we will use Proxy based Client
Proxy based Client 
       if client gene stubs at client side and uses it to invoke the webservice
dii client, dynamic invokation client
       in dii client, it doesnt generates stubs, instead websrive client provider provies class which acts as Stubs

stb generation tool to generate stubs, it is provided by Axis1
when using Eclipse, Eclipse internally uses Axis 1 tools to generates the Stubs for Developers
1 create Java Project with Project Name as ***Client
2 Copy WSDL file into Client Project
3 generate Stubs
4 create TestClient.java with main methods and use gened Stubs to invoke WebServices
