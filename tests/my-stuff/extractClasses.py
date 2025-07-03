import os
import sys

def find_classes_with_full_package(package_dir, base_package):
    classes = []
    for root, _, files in os.walk(package_dir):
        for file in files:
            if file.endswith(".java") and not file.startswith("package-info"):
                rel_path = os.path.relpath(root, package_dir)
                # Convert path to package notation
                if rel_path == ".":
                    package = base_package
                else:
                    #package = base_package + "." + rel_path.replace(os.sep, ".")
                    package =  rel_path.replace(os.sep, ".")
                class_name = file[:-5]  # Remove .java
                full_class = f"{package}.{class_name}"
                classes.append(full_class)
    return classes

def main():
    if len(sys.argv) < 5:
        print("Usage: python script.py <package_dir> <base_package> <output_file> <class_to_remove1> [<class_to_remove2> ...]")
        sys.exit(1)

    package_dir = sys.argv[1]
    base_package = sys.argv[2]
    output_file = sys.argv[3]
    classes_to_remove = set(sys.argv[4:])

    all_classes = find_classes_with_full_package(package_dir, base_package)
    filtered_classes = [cls for cls in all_classes if cls.split(".")[-1] not in classes_to_remove]

    with open(output_file, "w") as f:
        f.write(",".join(filtered_classes))

    print(f"Written {len(filtered_classes)} classes to {output_file}")

if __name__ == "__main__":
    main()