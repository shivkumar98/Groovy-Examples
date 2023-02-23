package section6_usingbuilders

import groovy.xml.MarkupBuilder

def xml = new MarkupBuilder().'root-node'()

// println xml // <root-node />root-node

// adding attributes

xml = new MarkupBuilder().'root-node'([attribute1:'value1'])

println xml