import sys

from PyQt5 import QtWidgets
from PyQt5.QtWidgets import QMainWindow,QApplication
from PyQt5.uic import loadUi

class MyWindow(QMainWindow):
    def __init__(self):
        super(MyWindow,self).__init__()
        loadUi("mainwindow.ui",self)
        self.runButton.clicked.connect(self.runfunction)
        
    def runfunction(self):
        task = str(self.taskbox.currentText())
        folder = self.folderline.text()
        wait_time = self.waitline.text()
        wait_unit = str(self.waitbox.currentText())
        shutdown_time = self.shutdownline.text()
        shutdown_unit = str(self.shutdownbox.currentText())
        self.goto_running(task,folder,wait_time,wait_unit,shutdown_time,shutdown_unit)
        # print(f'task is {task}, folder is {folder}, wait time is {wait_time} with unit {wait_unit}, shutdown time is {shutdown_time} with unit {shutdown_unit}')
    
    
    def goto_running(self,task,folder,wait_time,wait_unit,shutdown_time,shutdown_unit):
        running_window = RunningWindow(task,folder,wait_time,wait_unit,shutdown_time,shutdown_unit)
        widget.addWidget(running_window)
        widget.setCurrentIndex(widget.currentIndex()+1)
            
class RunningWindow(QMainWindow):
    def __init__(self,task,folder,wait_time,wait_unit,shutdown_time,shutdown_unit):
        super(RunningWindow,self).__init__()
        self.task = str(task)
        self.folder = str(folder)
        self.wait_time = str(wait_time)
        self.wait_unit = str(wait_unit)
        self.shutdown_time = str(shutdown_time)
        self.shutdown_unit = str(shutdown_unit)
        loadUi("running.ui",self)
        self.plainTextEdit.appendPlainText(f'执行任务： {task}, 组数为 {folder}, 执行延迟为 {wait_time} {wait_unit}, 关机延迟为 {shutdown_time} {shutdown_unit}')
        self.stopButton.clicked.connect(self.stopfunction)
        
    def stopfunction(self):
        mainwindow = MyWindow()
        widget.addWidget(mainwindow)
        widget.setCurrentIndex(widget.currentIndex()+1)               
        
app = QApplication(sys.argv)
mainwindow = MyWindow()
widget = QtWidgets.QStackedWidget()
widget.addWidget(mainwindow)
widget.setFixedWidth(480)
widget.setFixedHeight(420)
widget.show()
sys.exit(app.exec_())