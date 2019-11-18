package org.scalameta.intellij;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ContentIterator;
import com.intellij.openapi.util.Condition;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.Processor;
import com.intellij.util.indexing.FileBasedIndex;
import com.intellij.util.indexing.ID;
import com.intellij.util.indexing.IndexableFileSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class EmptyFileBasedIndex extends FileBasedIndex  {
    public EmptyFileBasedIndex() {
        super();
    }

    @Override
    public void iterateIndexableFiles(@NotNull ContentIterator processor, @NotNull Project project, ProgressIndicator indicator) {

    }

    @Nullable
    @Override
    public VirtualFile getFileBeingCurrentlyIndexed() {
        return null;
    }

    @Override
    public void registerIndexableSet(@NotNull IndexableFileSet set, @Nullable Project project) {

    }

    @Override
    public void removeIndexableSet(@NotNull IndexableFileSet set) {

    }

    @Override
    public VirtualFile findFileById(Project project, int id) {
        return null;
    }

    @NotNull
    @Override
    public <K, V> List<V> getValues(@NotNull ID<K, V> indexId, @NotNull K dataKey, @NotNull GlobalSearchScope filter) {
        return Collections.emptyList();
    }

    @NotNull
    @Override
    public <K, V> Collection<VirtualFile> getContainingFiles(@NotNull ID<K, V> indexId, @NotNull K dataKey, @NotNull GlobalSearchScope filter) {
        return Collections.emptyList();
    }

    @Override
    public <K, V> boolean processValues(@NotNull ID<K, V> indexId, @NotNull K dataKey, @Nullable VirtualFile inFile, @NotNull ValueProcessor<? super V> processor, @NotNull GlobalSearchScope filter) {
        return false;
    }

    @Override
    public <K, V> long getIndexModificationStamp(@NotNull ID<K, V> indexId, @NotNull Project project) {
        return 0;
    }

    @Override
    public <K, V> boolean processFilesContainingAllKeys(@NotNull ID<K, V> indexId, @NotNull Collection<? extends K> dataKeys, @NotNull GlobalSearchScope filter, @Nullable Condition<? super V> valueChecker, @NotNull Processor<? super VirtualFile> processor) {
        return false;
    }

    @NotNull
    @Override
    public <K> Collection<K> getAllKeys(@NotNull ID<K, ?> indexId, @NotNull Project project) {
        return Collections.emptyList();
    }

    @Override
    public <K> void ensureUpToDate(@NotNull ID<K, ?> indexId, @Nullable Project project, @Nullable GlobalSearchScope filter) {

    }

    @Override
    public void requestRebuild(@NotNull ID<?, ?> indexId, Throwable throwable) {

    }

    @Override
    public <K> void scheduleRebuild(@NotNull ID<K, ?> indexId, @NotNull Throwable e) {

    }

    @Override
    public void requestReindex(@NotNull VirtualFile file) {

    }

    @Override
    public <K, V> boolean getFilesWithKey(@NotNull ID<K, V> indexId, @NotNull Set<? extends K> dataKeys, @NotNull Processor<? super VirtualFile> processor, @NotNull GlobalSearchScope filter) {
        return false;
    }

    @Override
    public <K> boolean processAllKeys(@NotNull ID<K, ?> indexId, @NotNull Processor<? super K> processor, @Nullable Project project) {
        return false;
    }

    @NotNull
    @Override
    public <K, V> Map<K, V> getFileData(@NotNull ID<K, V> id, @NotNull VirtualFile virtualFile, @NotNull Project project) {
        return Collections.emptyMap();
    }
}
