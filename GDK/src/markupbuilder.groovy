def data = [:] // data can be loaded from TEDS environment to supply attribute/tag values
def xml = new groovy.xml.StreamingMarkupBuilder().bind{
      builder ->
            buildFile(builder, data)
}
def buildFile(builder, data){
      def rootAttributes = [:] // creating an empty map to store attribute data
      rootAttributes['RootAttr1'] = 'RootValue1'
      rootAttributes['RootAttr2'] = 'RootValue2'
      builder.'RootElement'(rootAttributes){
            this.buildChildNode(builder,data)
      } // on the builder, we define the current tag being created
}
def buildChildNode(builder, data){
      def childAttributes = [:]
      childAttributes['ChildAttr1'] = 'ChildVal1'
      childAttributes['ChildAttr2'] = 'ChildVal2'
      builder.'ChildNode'(childAttributes){
            this.buildSubChildNode(builder, data)
      }
}
def buildSubChildNode(builder, data){
      builder.'SubChildNode'('SubChildNodeValue')
}
def xmlOutput = groovy.xml.XmlUtil.serialize(xml)
print(xmlOutput)

def TransientType = "T"
def steadyState = true
def AvSamples = 0
if (steadyState == true) { AvSamples=8}
else {
      if (TransientType=="T") { AvSamples=7 }
      else if (TransientType=="R") { AvSamples=3 }
      else if (TransientType=="C") { AvSamples=0 }
}