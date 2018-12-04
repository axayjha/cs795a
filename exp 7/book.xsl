<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/2001/xsl/transform" version="1.0">

<xsl:template match="/">

<html>
<body>
	<p>Hello</p>
	<xsl:for-each select="book">
		Book_name <xsl:value-of select="Book_name"/>
		Author_name <xsl:value-of select="Author_name"/><br/>
	</xsl:for-each>

</body>
</html>
</xsl:template>
</xsl:stylesheet>