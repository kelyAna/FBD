# Fundamentos de banco de dados

Este repositório possui o trabalho final da disciplina de Fundamentos de Banco de Dados, pertencente ao semestre 2019.1. O trabalho se refere a um sistema de gerenciamento de alunos com conexão a um banco de dados PostgreSQL.

# Eclipse IDE and PostgreSQL

Eclipse is an IDE for Java development, however it supports several other languages ​​from plugins like C / C ++, PHP, ColdFusion, Python, Scala and Kotlin. It was made in Java and follows the open source model of software development.

PostgreSQL is a relational object database management system, developed as an open source project.

# Eclipse IDE installation

![Eclipse IDE](https://fernandofranzini.files.wordpress.com/2018/05/maxresdefault.jpg?w=200)

Step 1. Open a terminal;
Step 2. If you have already done a manual installation of the program, use the commands below to delete it;
```bash
rm -Rf /opt/eclipse/
```

```bash
rm -Rf /usr/share/applications/eclipse.desktop
```
Step 3. Check if your system is 32-bit or 64-bit, to do this, use the following command in the terminal:
```bash
uname -m
```
Step 4. If your system is 32-bit, use the command below. If the link is out of date, access this page, download the latest version and save the file with the name eclipse.tar.gz;
```bash
wget -c http://eclipse.c3sl.ufpr.br/technology/epp/downloads/release/photon/R/eclipse-jee-photon-R-linux-gtk.tar.gz -O eclipse.tar.gz
```

Step 5. If your system is 64-bit, use the command below. If the link is out of date, access this page, download the latest version and save the file with the name eclipse.tar.gz;
```bash
wget -c http://eclipse.c3sl.ufpr.br/technology/epp/downloads/release/photon/R/eclipse-jee-photon-R-linux-gtk-x86_64.tar.gz -O eclipse.tar.gz
```

Step 9. If your current graphic environment supports it, create a launcher for the program, executing the command below;
```bash
echo -e '[Desktop Entry]\n Version=1.0\n Name=eclipse\n Exec=/opt/eclipse/eclipse\n Icon=/opt/eclipse/eclipse.png\n Type=Application\n Categories=Application' | sudo tee /usr/share/applications/eclipse.desktop
```


