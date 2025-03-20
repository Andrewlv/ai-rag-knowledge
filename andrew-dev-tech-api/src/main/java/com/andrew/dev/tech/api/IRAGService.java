package com.andrew.dev.tech.api;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IRAGService {

    Response<List<String>> queryRagTagList();

    Response<String> uploadFile(String ragTag, List<MultipartFile> files);

    Response<String> analyzeGitRepo(String repoUrl, String userName, String token) throws IOException, GitAPIException, Exception;
}
