#!/usr/bin/bash
#hi
init_shell() {
  
  home=${PWD##*/}
  host=$(hostname)
  user=$(whoami)
  exec 3<>/dev/tcp/localhost/10000
}



print_prompt() {
  dir=${PWD##*/}
  if [[ ${#dir} > 0 ]] && [ $dir = $home ]
  then
    dir="~"
  fi
  prompt="$host:$dir $user$"
}



init_shell
echo $home
while :
  do  
  print_prompt
  read -p "$prompt $curr" -e COMMANDS
  params=($COMMANDS)
  echo ${params[0]}
  if [ ${params[0]} = "pass" ] 
  then 
     echo ${params[0]} ${params[1]} ${params[2]} 
	 echo ${params[1]} >&3
	 echo ${params[2]} >&3
	 read -r line <&3
	 echo $line	 
  else
    eval "$COMMANDS"
  fi
  
  done
