# Linux Common Commands

## System Service Management

### systemctl

- Start service: systemctl start httpd.service
- Close service: systemctl stop httpd.service
- Restart service (whether running or not): systemctl restart httpd.service
- Reloading configuration (no service interruption): systemctl reload httpd.service
- Check operation status: systemctl status httpd.service
- Set boot and start: systemctl enable httpd.service
- Disable boot: systemctl disable httpd.service
- View system installed services: systemctl list-units —type=service

## File Management

### ls
List subdirectory under /home directory: ls -l /home
List all folders and file sizes under the current folder: ls -lht

### pwd
Show current working directory

### cd
Switch directory: cd /usr/local

### date
Displays the date in the specified format; date '+date: %x time: %X'

### passwd
Modify root password: passwd root

### su
Normal User Switched to SuperUser: su -

### clear
Clear screen information

### man
View help information for ls command: man ls

### who
- View current run level: who -r
- Login details for display: who -buT

### free
Memory usage in MB: free -m

### ps
View all processes in the system: ps -ef
View running java processes: ps -ef | grep java

### top
View system currently active process information

### mkdir
Create Directory

### more 

Pageview
One screen view every 10 lines: more -c -10

### cat
View config file: cat -Ab config

### rm
- Delete files: rm a.txt
- Delete folder: rm -rf a/

### touch
Create a file: touch a.txt

### cp
Copy files from directory a to directory b:cp -r /home/a /home/b

### mv
Move or overwrite files: mv a.txt b.txt

## Compression and Unzip

### tar
- Package folders to separate files: tar -cvf /opt/etc.tar /etc
- Compress folder to compressed file (gzip): tar -zcvf /opt/etc.tar.gz /etc
- Compress folder to compressed file (bzip2): tar -jcvf /opt/etc.tar.bz2 /etc
- Check the contents of the package (gzip): tar -ztvf /opt/etc.tar.gz /etc
- Extract files to current directory (gzip): tar -zxvf /opt/etc.tar.gz

## Disk and Network Management

### df
View Disk Usage: df -hT

### ifconfig
View Current Network Interface Status

### netstat

- View routing information: netstat -rn
- View all valid TCP connections: netstat -an
- View the listening service started on the system: netstat -tulnp
- View connected system resource information: netstat -atunp

### wget
Download software from the web

## Software Installation and Management

### rpm

- Install package: rpm -ivh nginx-1.12.2-2.el7.x86_64.rpm
- Fuzzy Search Package: rpm -qa | grep nginx
- Find packages precisely: rpm -qa nginx
- Query package installation path: rpm -ql nginx-1.12.2-2.el7.x86_64
- View package summary information: rpm -qi nginx-1.12.2-2.el7.x86_64
- Verify package contents and installation files are consistent: rpm -V nginx-1.12.2-2.el7.x86_64
- Update package: rpm -Uvh nginx-1.12.2-2.el7.x86_64
- Remove package: rpm -e nginx-1.12.2-2.el7.x86_64

### yum

- Install package: yum install nginx
- Check packages that can be updated: yum check-update
- Update the specified package: yum update nginx
- Find package information in repository: yum info nginx*
- List all installed packages: yum info installed
- List package name: yum list redis*
- Fuzzy Search Package: yum search redis

## Network Security

### iptables

- Enable firewall: systemctl start iptables.service
- Firewall off: systemctl stop iptables.service
- View firewall status: systemctl status iptables.service
- Set boot and start: systemctl enable iptables.service
- Disable boot start: systemctl disable iptables.service
- View the chain information of the filter table: iptables -L -n
- View chain information for NAT tables: iptables -t nat -L -n
- Clear all firewall rules: iptables -F; iptables -X; iptables -Z;
- Add filter rules (development port 80): iptables -I INPUT -p tcp —dport 80 -j ACCEPT
- Find the line number made by the rule: iptables -L INPUT —line-numbers -n
- Delete filter based on line number: iptables -D INPUT 1



