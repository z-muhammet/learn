package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

var number, bos int = 0, 1
var reader = bufio.NewReader(os.Stdin)

func listing(n []string, s []string, jo []string) {
	for j := 0; j <= number-1; j++ {
		fmt.Println("id:", j, "\tName:", n[j], "\tSurname:", s[j], "\tArea:", jo[j])
	}
}
func add(number int, name []string, surname []string, job []string) {
	fmt.Print("pls u enter name: ")
	name[number], _ = reader.ReadString('\n')
	name[number] = strings.TrimSpace(name[number])
	fmt.Print("pls u enter surname: ")
	surname[number], _ = reader.ReadString('\n')
	surname[number] = strings.TrimSpace(surname[number])
	fmt.Print("pls u enter job: ")
	job[number], _ = reader.ReadString('\n')
	job[number] = strings.TrimSpace(job[number])
}
func main() {
	var pass, username string
	slc, ss, id := 0, "1", 0
	var name [256]string
	var surname [256]string
	var job [256]string
	for true {
		print("pls u enter username: ")
		fmt.Scanln(&username)
		print("pls u enter password: ")
		fmt.Scanln(&pass)
		if (username == "admin") && (pass == "1234") {
			break
		} else {
			fmt.Println("pls try again...")
		}
	}
	for true {
		fmt.Print("pls u select (new (1) edit(2) delete(3) list(4)): ")
		fmt.Scanln(&slc)
		switch slc {
		case 1:
			ss = "1"
			for ; ss != "0"; number++ {
				add(number, name[:], surname[:], job[:])
				fmt.Print("if u need stop pls u enter '0': ")
				fmt.Scanln(&ss)
			}
		case 2:
			if number > 0 {
				listing(name[:], surname[:], job[:])
				fmt.Print("pls u enter edited worker id: ")
				fmt.Scanln(&id)
				if id < number {
					add(id, name[:], surname[:], job[:])
				} else {
					fmt.Println("pls u try again.")
				}
			} else {
				fmt.Println("pls u try again.")
			}
		case 3:
			listing(name[:], surname[:], job[:])
			if number > 0 {
				fmt.Print("pls u enter deleted worker id: ")
				fmt.Scanln(&id)
				if id < number {
					for k := id; k <= number; k++ {
						name[id] = name[id+1]
						surname[id] = surname[id+1]
						job[id] = job[id+1]
					}
					number--
				} else {
					fmt.Println("pls u try again.")
				}
			} else {
				fmt.Println("pls u try again.")
			}

		case 4:
			listing(name[:], surname[:], job[:])
		default:
			fmt.Println("pls u try again.")
		}
	}

}
