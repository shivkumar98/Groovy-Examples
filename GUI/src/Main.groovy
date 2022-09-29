import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL


new SwingBuilder().edt {
      frame(title: 'Shiv\'s ATM', size: [750, 7500], show: true) {
            borderLayout()
            textlabel = label(text: '1', constraints: BL.NORTH)
            button(bounds:,
                    text:'Click Me',
                    actionPerformed: {count++; textlabel.text = "Clicked ${count} time(s)."; println "clicked"}, constraints:BL.SOUTH)
      }
}
