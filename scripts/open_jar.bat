@echo off 
SET ThisScriptsDirectory="C:/code"
SET PowerShellScriptPath=%ThisScriptsDirectory%/open_jar.ps1
PowerShell.exe -NoProfile -ExecutionPolicy Bypass -Command "& '%PowerShellScriptPath%'";