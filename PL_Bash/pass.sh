#!/usr/bin/bash
#hi
init_shell() {
  
  exec 3<>/dev/tcp/localhost/10000
}

init_shell
echo $home
while :
  do  
  read -p "$" -e COMMANDS
  params=($COMMANDS)
  if [ ${params[0]} = "pass" ] 
  then 
	 echo ${params[1]} >&3
	 echo ${params[2]} >&3
	 read -r line <&3
	 echo $line	 
  else
    eval "$COMMANDS"
  fi
  
  done
