from PyQt5.QtCore import qSetFieldWidth
import PyQt5.QtWidgets as QtWidgets
from PyQt5.QtWidgets import QApplication,QMainWindow
import sys

class MyWindow(QMainWindow):
    def __init__(self, parent: typing.Optional[QWidget], flags: typing.Union[QtCore.Qt.WindowFlags, QtCore.Qt.WindowType]) -> None:
        super(MyWindow,self).__init__(parent=parent, flags=flags)
        # win.setGeometry(xpos,ypos,width,height)
        win.setGeometry(220,220,500,500)
        win.setWindowTitle("梦幻辅助")
        self.initUI()
        
    def initUI(self):
        self.label = QtWidgets.QLabel(self)
        self.label.setText("选择任务")
        self.label.move(50,50)
        
        self.b1 = QtWidgets.QPushButton(self)
        self.b1.setText('Click me')
        self.b1.clicked.connect(clicked)
    
    def clicked(self):
        self.label.setText('you pressed the button')
        


def clicked():
    print("clicked")

def window():
    app = QApplication(sys.argv)
    win = QMainWindow()
    

    

    
    
    win.show()
    sys.exit(app.exec_())

window()