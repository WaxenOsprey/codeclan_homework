package com.codeclan.files_and_folders.components;

import com.codeclan.files_and_folders.models.File;
import com.codeclan.files_and_folders.models.Folder;
import com.codeclan.files_and_folders.models.Person;
import com.codeclan.files_and_folders.repository.FileRepository;
import com.codeclan.files_and_folders.repository.FolderRepository;
import com.codeclan.files_and_folders.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Person person1 = new Person("Random McRandom");
        personRepository.save(person1);

        Folder folder1 = new Folder("folder1", person1);
        folderRepository.save(folder1);

        File file1 = new File("File1", ".txt", "2KB", folder1);
        fileRepository.save(file1);

        File file2 = new File("File2", ".jpeg", "4MB", folder1);
        fileRepository.save(file2);

        File file3 = new File("File3", ".exe", "210MB", folder1);
        fileRepository.save(file3);



    }
}
