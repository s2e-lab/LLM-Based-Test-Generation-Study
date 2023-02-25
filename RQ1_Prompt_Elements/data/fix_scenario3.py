def parse(directory):
    # iterate all Java files in a directory
    # read all its lines
    # find lines that starts with * >>>
    # remove the * >>>
    # remove the newline
    # add the line to the list
    # return the list
    lines = []
    for file in os.listdir(directory):
        if file.endswith(".java"):
            with open(os.path.join(directory, file), 'r') as f:
                for line in f:
                    if line.startswith("* >>>"):
                        lines.append(line[5:].rstrip())
    return lines

def main():
    # get the directory from the command line
    directory = sys.argv[1]
    # parse the directory
    lines = parse(directory)
    # print the lines
    for line in lines:
        print(line)

if __name__ == "__main__":
    main()
