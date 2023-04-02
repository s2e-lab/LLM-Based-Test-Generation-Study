# from sklearn.feature_extraction.text import TfidfVectorizer
# from sklearn.cluster import KMeans
# from sklearn.metrics import adjusted_rand_score

# documents = ["This little kitty came to play when I was eating at a restaurant.",
#              "Merley has the best squooshy kitten belly.",
#              "Google Translate app is incredible.",
#              "If you open 100 tab in google you get a smiley face.",
#              "Best cat photo I've ever taken.",
#              "Climbing ninja cat.",
#              "Impressed with google map feedback.",
#              "Key promoter extension for Google Chrome."]

# vectorizer = TfidfVectorizer(stop_words='english')
# X = vectorizer.fit_transform(documents)

# true_k = 2
# model = KMeans(n_clusters=true_k, init='k-means++', max_iter=100, n_init=1)
# model.fit(X)

# print("Top terms per cluster:")
# order_centroids = model.cluster_centers_.argsort()[:, ::-1]
# terms = vectorizer.get_feature_names_out()
# for i in range(true_k):
#     print("Cluster %d:" % i),
#     for ind in order_centroids[i, :10]:
#         print(' %s' % terms[ind]),
#     print

# print("\n")
# print("Prediction")

# Y = vectorizer.transform(["chrome browser to open."])
# prediction = model.predict(Y)
# print(prediction)

# Y = vectorizer.transform(["My cat is hungry."])
# prediction = model.predict(Y)
# print(prediction)


# import numpy as np
# from sklearn.cluster import AffinityPropagation
# from Levenshtein import distance
    
# # words = "YOUR WORDS HERE".split(" ") #Replace this line

# words = [
#     "illegal unicode escape",
#     "array dimension missing",
#     "integer number too large",
#     "not a statement",
#     "invalid method declaration; return type required",    
# ]
# # words = np.asarray(words) #So that indexing with a list will work
# lev_similarity = -1*np.array([[distance(w1,w2) for w1 in words] for w2 in words])

# affprop = AffinityPropagation(affinity="precomputed", damping=0.5)
# affprop.fit(lev_similarity)
# for cluster_id in np.unique(affprop.labels_):
#     print(cluster_id)
#     exemplar = words[affprop.cluster_centers_indices_[cluster_id]]
#     cluster = np.unique(words[np.nonzero(affprop.labels_==cluster_id)])
#     cluster_str = ", ".join(cluster)
#     print(" - *%s:* %s" % (exemplar, cluster_str))





import pandas as pd
import numpy as np


data=pd.read_excel('sample.xlsx') 
idea=data.iloc[:,0:1] #Selecting the first column that has text. 

# #Converting the column of data from excel sheet into a list of documents, where each document corresponds to a group of sentences.
corpus=[]
for index,row in idea.iterrows():
    corpus.append(row['_index_text_data'])

corpus = [str(item).replace(" ","-") for item in corpus]

# #Count Vectoriser then tidf transformer

# from sklearn.feature_extraction.text import CountVectorizer

# vectorizer = CountVectorizer()
# X = vectorizer.fit_transform(corpus) #ERROR AFTER EXECUTING THESE #LINES

# #vectorizer.get_feature_names()

# #print(X.toarray())     

# from sklearn.feature_extraction.text import TfidfTransformer

# transformer = TfidfTransformer(smooth_idf=False)
# tfidf = transformer.fit_transform(X)
# print(tfidf.shape )                        

# from sklearn.cluster import KMeans

# num_clusters = 10 #Change it according to your data.
# km = KMeans(n_clusters=num_clusters)
# km.fit(tfidf)
# clusters = km.labels_.tolist()

# idea={'Idea':corpus, 'Cluster':clusters} #Creating dict having doc with the corresponding cluster number.
# frame=pd.DataFrame(idea,index=[clusters], columns=['Idea','Cluster']) # Converting it into a dataframe.
# frame.to_csv("clusters.csv") 


# # try the stupid 


# print("\n")
# print(frame) #Print the doc with the labeled cluster number.
# print("\n")
# print(frame['Cluster'].value_counts()) #Print the counts of doc belonging `#to each cluster.`





# ==========
import numpy as np
from sklearn.cluster import AffinityPropagation
from Levenshtein import distance



def levenshtein(texts):
    '''
    Levenshtein Distance
    - It requires negative similarities, so -1 * levenshtein(t1, t2)
    '''
    texts = np.asarray(texts, dtype=object)
    _similarity = np.array([[distance(list(w1),list(w2)) for w1 in texts] for w2 in texts])
    _similarity = -1*_similarity
    return _similarity


def text_clustering(texts, similarity=levenshtein, word_level=False):
    '''Text Clustering'''
    # similarity
    if word_level: texts = [t.split() for t in texts]
    _similarity = levenshtein(texts)
    print(_similarity)
    _affprop = AffinityPropagation(affinity="precomputed", damping=0.5, verbose=True,
        random_state=0, max_iter=1_000, convergence_iter=10)
    _affprop.fit(_similarity)
    return _affprop, _similarity


def print_clusters(affprop, texts):
    '''Print clusters'''
    texts = np.asarray(texts)
    clusters = np.unique(affprop.labels_)
    print(f'\n~ Number of texts:: {texts.shape[0]}')
    print(f'~ Number of clusters:: {clusters.shape[0]}')
    if clusters.shape[0] < 2: return 'Only few clusters - Stopped'
    for cluster_id in clusters:
        exemplar = texts[affprop.cluster_centers_indices_[cluster_id]]
        cluster = np.unique(texts[np.nonzero(affprop.labels_==cluster_id)])
        cluster_str = '";\n  "'.join(cluster)
        print(f'\n# Cluster ({cluster_id}) with ({len(cluster)}) elements')
        print(f'Exemplar:: {exemplar}')
        print(f'\nOthers::\n  "{cluster_str}"')


# using only a set of 26 fake names
texts = corpus#["Hi", "Hello", "Hitheredkfjsdlkfjdsklfdsklfdsm,.fdsm"]


affprop, _ = text_clustering(texts, similarity=levenshtein, word_level=True)
print_clusters(affprop, texts)



