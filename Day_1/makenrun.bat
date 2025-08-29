@echo off
set /p name="Enter new file name: "
type nul > %name%.java & start /wait notepad %name%.java
javac %name%.java && java %name%
pause