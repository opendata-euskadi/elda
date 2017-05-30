<h1>Elda, an implementation of the Linked Data API</h1>

<p>
	Elda is a Java implementation of the 
	<a href="http://code.google.com/p/linked-data-api/" rel="nofollow">Linked Data API</a>,
	which provides a configurable way to access RDF data using simple 
	RESTful URLs that are translated into queries to a SPARQL endpoint. 
	The API developer (probably you) writes an API spec (in RDF) which 
	specifies how to translate URLs into queries. 
</p>

<p>
	Elda is the 
	<a href="http://www.epimorphics.com/web/">Epimorphics</a> implementation of the LDA. The <i>standalone jar</i>
	comes with pre-built examples which allow you to experiment with the style 
	of query and get started with building your own configurations using
	<i>elda common</i> or your own webapps.
</p>

<p>
	See <a href="http://epimorphics.github.io/elda/current/index.html">
		the current Elda documentation,
	</a> or the forthcoming release's documentation linked from
	<a href="http://epimorphics.github.io/elda/index.html">
		the documentation index
	</a>.
</p>

<p>
<b>(!!!)</b> Edits by Mikel for local deploy:

* Edited /elda/elda-common/src/main/webapp/WEB-INF/web.xml
* Added /etc/elda/conf.d/elda-common/describe-nti.ttl
* Edited /elda-assets/src/main/webapp/css/result.css
* Added /elda-assets/src/main/webapp/images/logo_opendata.gif
* Added /elda/test-data/calidad-aire-en-euskadi-2017
* Edited /elda-assets/src/main/webapp/xslt/result.xsl


For the RDF data used, refer to https://github.com/opendata-euskadi/LOD-datasets/tree/URIs-con-ID-envezde-RECURSO/calidad-aire-en-euskadi-2017/rdf

The config assumes a SPARQL endpoint at http://localhost:9999/blazegraph/sparql

</p>
