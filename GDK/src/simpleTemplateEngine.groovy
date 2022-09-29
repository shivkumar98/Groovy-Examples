import groovy.text.SimpleTemplateEngine
import groovy.text.Template

def binding = [
        title: "shiv's boson theory",
        firstname:"shiv",
        lastname : "Kumar",
        accepted : true,

]

SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template = engine.createTemplate(new File('text.txt'))

println template.make(binding)

def file = new File('output.txt')
file.write(template.make(binding).toString())